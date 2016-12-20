$(document).ready(function () {
    /**
     *  抽象的功能切换接口
     */
    var IPageSelect = function () {

    }
    /**
     *  切换功能抽象方法
     */
    IPageSelect.prototype.changeItem = function (url) {
        throw "抽象方法";
    }
    // 功能类
    var PageSelect = function () {
        // TODO: 可用于存储角色信息等
    }

    PageSelect.prototype = new IPageSelect();

    PageSelect.prototype.changeItem = function (url) {
        $('.page').attr("src", url);
    }

    function factory(key) {
        if (key == "PageSelect") {
            return new PageSelect();
        }
    }

    var pageSelect = factory("PageSelect");

    // 监听a标签点击事件，切换页面
    $('.a4page').click(function () {
        var url = $(this).data("url");
        pageSelect.changeItem(url);
        $('.selectAbleItem').removeClass("selected");
        $(this).addClass("selected");
    });
    // TODO弃之不用
    // selectBar监听事件
    //	$('.selectAbleItem').click(function() {
    //		var url = $(this).data("url");
    //		pageSelect.changeItem(url);
    //
    //		$('.selectAbleItem').removeClass("selected");
    //		$(this).addClass("selected");
    //	});
    $('.selectAbleItem').mouseover(function () {
        $(this).addClass("mouseover");
    });
    $('.selectAbleItem').mouseout(function () {
        $('.selectAbleItem').removeClass("mouseover");
    });
    $('.sortButton').click(function () {
        alert("TODO");
    });
});