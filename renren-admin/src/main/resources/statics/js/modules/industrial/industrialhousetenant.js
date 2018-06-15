$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'industrial/industrialhousetenant/list',
        datatype: "json",
        colModel: [			
			{ label: 'tenantId', name: 'tenantId', index: 'tenant_id', width: 50, key: true },
			{ label: '租客名称', name: 'tenantName', index: 'tenant_name', width: 80 }, 			
			{ label: '租客公司名称', name: 'tenantCompany', index: 'tenant_company', width: 80 }, 			
			{ label: '证件名称', name: 'certificateTyep', index: 'certificate_tyep', width: 80 }, 			
			{ label: '证件编号', name: 'certificateNumber', index: 'certificate_number', width: 80 }, 			
			{ label: '手机号', name: 'tenantMob', index: 'tenant_mob', width: 80 }, 			
			{ label: '固定电话', name: 'tenantTel', index: 'tenant_tel', width: 80 }, 			
			{ label: '备注信息', name: 'remark', index: 'remark', width: 80 }, 			
			{ label: '证件图片', name: 'certificatePicpath', index: 'certificate_picpath', width: 80 }			
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
		industrialHouseTenant: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.industrialHouseTenant = {};
		},
		update: function (event) {
			var tenantId = getSelectedRow();
			if(tenantId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(tenantId)
		},
		saveOrUpdate: function (event) {
			var url = vm.industrialHouseTenant.tenantId == null ? "industrial/industrialhousetenant/save" : "industrial/industrialhousetenant/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.industrialHouseTenant),
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
			var tenantIds = getSelectedRows();
			if(tenantIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "industrial/industrialhousetenant/delete",
                    contentType: "application/json",
				    data: JSON.stringify(tenantIds),
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
		getInfo: function(tenantId){
			$.get(baseURL + "industrial/industrialhousetenant/info/"+tenantId, function(r){
                vm.industrialHouseTenant = r.industrialHouseTenant;
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