$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'industrial/industrialhouselease/list',
        datatype: "json",
        colModel: [			
			{ label: 'houseId', name: 'houseId', index: 'house_id', width: 50, key: true },
			{ label: '城区', name: 'partitionname', index: 'partitionName', width: 80 }, 			
			{ label: '小区名称', name: 'placesname', index: 'placesName', width: 80 }, 			
			{ label: '楼栋', name: 'buildingname', index: 'buildingName', width: 80 }, 			
			{ label: '单元', name: 'unitname', index: 'unitName', width: 80 }, 			
			{ label: '房号', name: 'roomnumber', index: 'roomNumber', width: 80 }, 			
			{ label: '租金', name: 'rent', index: 'rent', width: 80 }, 			
			{ label: '租期', name: 'expiredate', index: 'expireDate', width: 80 }, 			
			{ label: '房屋布局图', name: 'picpath', index: 'picPath', width: 80 }, 			
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
        q:{
            partitionname: null
        },
		showList: true,
		title: null,
		industrialHouseLease: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.industrialHouseLease = {};
		},
		update: function (event) {
			var houseId = getSelectedRow();
			if(houseId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(houseId)
		},
		saveOrUpdate: function (event) {
			var url = vm.industrialHouseLease.houseId == null ? "industrial/industrialhouselease/save" : "industrial/industrialhouselease/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.industrialHouseLease),
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
			var houseIds = getSelectedRows();
			if(houseIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "industrial/industrialhouselease/delete",
                    contentType: "application/json",
				    data: JSON.stringify(houseIds),
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
		/*
		getInfo: function(houseId){
			$.get(baseURL + "industrial/industrialhouselease/info/"+houseId, function(r){
                vm.industrialHouseLease = r.industrialHouseLease;
            });
		},*/
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{
                postData:{'partitionname': vm.q.partitionname},
                page:page
            }).trigger("reloadGrid");
		}
	}
});