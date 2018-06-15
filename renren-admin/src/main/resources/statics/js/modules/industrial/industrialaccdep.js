$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'industrial/industrialaccdep/list',
        datatype: "json",
        colModel: [			
			{ label: 'depId', name: 'depId', index: 'dep_id', width: 50, key: true },
			{ label: '部门名称', name: 'depName', index: 'dep_name', width: 80 }, 			
			{ label: '上级单位', name: 'depParent', index: 'dep_parent', width: 80 }, 			
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
		industrialAccDep: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.industrialAccDep = {};
		},
		update: function (event) {
			var depId = getSelectedRow();
			if(depId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(depId)
		},
		saveOrUpdate: function (event) {
			var url = vm.industrialAccDep.depId == null ? "industrial/industrialaccdep/save" : "industrial/industrialaccdep/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.industrialAccDep),
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
			var depIds = getSelectedRows();
			if(depIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "industrial/industrialaccdep/delete",
                    contentType: "application/json",
				    data: JSON.stringify(depIds),
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
		getInfo: function(depId){
			$.get(baseURL + "industrial/industrialaccdep/info/"+depId, function(r){
                vm.industrialAccDep = r.industrialAccDep;
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