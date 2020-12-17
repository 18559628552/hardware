function returnback() {
    var msg = "您真的确定要退货吗？\n\n请确认！";
    if (confirm(msg)==true){
        alert("退货成功");
        location.href = "order.html";
    }else{
        return false;
    }
}

function changegoods() {
    var msg = "您真的确定要换货吗？\n\n请确认！";
    if (confirm(msg)==true){
        alert("换货成功，请注意查收");
        location.href = "order.html";
    }else{
        return false;
    }
}

function check() {
    var msg = "是否完成订单？\n\n请确认！";
    if (confirm(msg)==true){
        alert("订单已完成");
        location.href = "order.html";
    }else{
        return false;
    }
}