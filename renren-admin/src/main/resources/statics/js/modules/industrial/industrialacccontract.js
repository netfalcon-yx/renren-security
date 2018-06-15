$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'industrial/industrialacccontract/list',
        datatype: "json",
        colModel: [			
			{ label: 'contractId', name: 'contractId', index: 'contract_id', width: 50, key: true },
			{ label: '员工编号', name: 'empId', index: 'emp_id', width: 80 }, 			
			{ label: '合同计数', name: 'contractCount', index: 'contract_count', width: 80 }, 			
			{ label: '合同类型', name: 'contractType', index: 'contract_type', width: 80 }, 			
			{ label: '合同起始时间', name: 'contractStart', index: 'contract_start', width: 80 }, 			
			{ label: '合同截止时间', name: 'contractEnd', index: 'contract_end', width: 80 }, 			
			{ label: '合同签订时间', name: 'contractDate', index: 'contract_date', width: 80 }, 			
			{ label: '经办人', name: 'contractOperator', index: 'contract_operator', width: 80 }, 			
			{ label: '合同文本', name: 'contractPic', index: 'contract_pic', width: 80 }, 			
			{ label: '备注', name: 'remark', index: 'remark', width: 80 }			
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
		industrialAccContract: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.industrialAccContract = {};
		},
		update: function (event) {
			var contractId = getSelectedRow();
			if(contractId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(contractId)
		},
		saveOrUpdate: function (event) {
			var url = vm.industrialAccContract.contractId == null ? "industrial/industrialacccontract/save" : "industrial/industrialacccontract/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.industrialAccContract),
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
			var contractIds = getSelectedRows();
			if(contractIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "industrial/industrialacccontract/delete",
                    contentType: "application/json",
				    data: JSON.stringify(contractIds),
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
		getInfo: function(contractId){
			$.get(baseURL + "industrial/industrialacccontract/info/"+contractId, function(r){
                vm.industrialAccContract = r.industrialAccContract;
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