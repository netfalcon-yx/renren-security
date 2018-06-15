$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'industrial/industrialhouseleaselog/list',
        datatype: "json",
        colModel: [			
			{ label: 'leaseId', name: 'leaseId', index: 'lease_id', width: 50, key: true },
			{ label: '房屋id', name: 'houseId', index: 'house_id', width: 80 }, 			
			{ label: '租客id', name: 'tenantId', index: 'tenant_id', width: 80 }, 			
			{ label: '入住日期', name: 'startDate', index: 'start_date', width: 80 }, 			
			{ label: '到期日期', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '经办人', name: 'agent', index: 'agent', width: 80 }, 			
			{ label: '租金', name: 'rent', index: 'rent', width: 80 }, 			
			{ label: '租金状态', name: 'rentType', index: 'rent_type', width: 80 }, 			
			{ label: '押金', name: 'deposit', index: 'deposit', width: 80 }, 			
			{ label: '押金状态', name: 'depositType', index: 'deposit_type', width: 80 }, 			
			{ label: '备注信息', name: 'remark', index: 'remark', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		industrialHouseLeaselog: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.industrialHouseLeaselog = {};
		},
		update: function (event) {
			var leaseId = getSelectedRow();
			if(leaseId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(leaseId)
		},
		saveOrUpdate: function (event) {
			var url = vm.industrialHouseLeaselog.leaseId == null ? "industrial/industrialhouseleaselog/save" : "industrial/industrialhouseleaselog/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.industrialHouseLeaselog),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var leaseIds = getSelectedRows();
			if(leaseIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "industrial/industrialhouseleaselog/delete",
                    contentType: "application/json",
				    data: JSON.stringify(leaseIds),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(leaseId){
			$.get(baseURL + "industrial/industrialhouseleaselog/info/"+leaseId, function(r){
                vm.industrialHouseLeaselog = r.industrialHouseLeaselog;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});