function win() {
if (confirm("You win")){
    window.location.href = "http://localhost:3636/"}
}
function lose() {
    if (confirm("You win")){
        window.location.href = "http://localhost:3636/"
    }
}
function headAttack( enemy) {
    debugger;
    var enemyTable = document.getElementById("enemy");
    var playerTable  = document.getElementById("player");
    var enemyData =  enemyTable.rows[0];
    var playerData =  playerTable.rows[0];
    var enemyHealth = enemyData.cells[1].innerHTML;
    var playerHealth = playerData.cells[1].innerHTML;
    var data = {};
    data["enemyHealth"] = enemyHealth;
    data["playerHealth"] = playerHealth;
    alert(JSON.stringify(data));
    $.ajax({
        url: 'ajax/battle/head/'+ enemy,
        contentType : "application/json",
        dataType : 'json',
        data : JSON.stringify(data),
        type: "Post",
        success: function(data){
            if (data["enemyHealth"]<=0) {
                return win();
            }
            if (data["playerHealth"]<=0) {
                return lose();
            }
            enemyData.cells[1].innerText = data["enemyHealth"];
            playerData.cells[1].innerText = data["playerHealth"];

    }
    })
}

function bodyAttack(enemy) {
    debugger;
    var table = document.getElementById("enemy");
    var trs = table.rows;
    var dataType = table.rows[0];
    var nodeValue = dataType.cells[1].innerHTML;
    var data = {};
    data["health"] = nodeValue;
    alert(enemy + " " + nodeValue);
    alert(JSON.stringify(data));
    $.ajax({
        url: 'ajax/battle/head/' + enemy,
        contentType: "application/json",
        dataType: 'json',
        data: JSON.stringify(data),
        type: "Post",
        success: function (data) {
            alert("Okay");
        }
    })
}

    function legsAttack(enemy) {
        debugger;
        var table=document.getElementById("enemy");
        var trs=table.rows;
        var dataType=table.rows[0];
        var nodeValue=dataType.cells[1].innerHTML;
        var data= {};
        data["health"]=nodeValue;
        alert(enemy + " " + nodeValue);
        alert(JSON.stringify(data));
        $.ajax({
            url: 'ajax/battle/head/'+ enemy,
            contentType : "application/json",
            dataType : 'json',
            data : JSON.stringify(data),
            type: "Post",
            success: function(data){
                alert("Okay");
            }
        })
}