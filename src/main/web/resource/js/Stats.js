$(document).ready(function() {
    $("#arrowStrength").click(function() {
        var innerText = document.getElementById("Point").innerText;
        if (parseInt(innerText)>0) {
            $.ajax({
                url: "ajax/strength",
                type: "Get",
                success: function (data) {
                    debugger;
                    var split = data.split(" ");
                    var elementById = document.getElementById("Strength").innerText;
                    var innerText = document.getElementById("Point").innerText;
                    //noinspection JSValidateTypes
                    if (parseInt(innerText) > 0) {
                        document.getElementById("Strength").innerHTML = parseInt(elementById) + 1;
                        document.getElementById("Point").innerHTML = parseInt(innerText) - 1;
                        document.getElementById("Health").innerHTML = split[1];
                        document.getElementById("Attack").innerHTML = split[0];
                    }
                }
            });
        }});
    $('#arrowVitality').click(function() {
        debugger;
        var innerText = document.getElementById("Point").innerText;
        if (parseInt(innerText)>0) {
            $.ajax({
                url: "ajax/vitality",
                type: "Get",
                success: function (data) {
                    debugger;
                    var split = data.split(" ");
                    var elementById = document.getElementById("Vitality").innerText;
                    var innerText = document.getElementById("Point").innerText;
                    //noinspection JSValidateTypes
                    if (parseInt(innerText) > 0) {
                        document.getElementById("Vitality").innerHTML = parseInt(elementById) + 1;
                        document.getElementById("Point").innerHTML = parseInt(innerText) - 1;
                        document.getElementById("Health").innerHTML = split[1];
                        document.getElementById("Attack").innerHTML = split[0];
                    }
                }
            });
        }});

    $("#arrowIntelligence").click(function() {
        var innerText = document.getElementById("Point").innerText;
        if (parseInt(innerText)>0) {
        $.ajax({
            url: "ajax/intelligence",
            type: "Get",
            success: function(data) {
                debugger;
                var split = data.split(" ");
                var elementById = document.getElementById("Intelligence").innerText;
                var innerText = document.getElementById("Point").innerText;
                //noinspection JSValidateTypes
                if (parseInt(innerText)>0) {
                    document.getElementById("Intelligence").innerHTML = parseInt(elementById) + 1;
                    document.getElementById("Point").innerHTML = parseInt(innerText)-1;
                    document.getElementById("Mana").innerHTML = split[1];
                    document.getElementById("Attack").innerHTML = split[0];
                }
            }
        });
            }});
    $("#arrowAgility").click(function() {
        var innerText = document.getElementById("Point").innerText;
        if (parseInt(innerText)>0) {
        $.ajax({
            url: "ajax/agility",
            type: "Get",
            success: function(data) {
                debugger;
                var split = data.split(" ");
                var elementById = document.getElementById("Agility").innerText;
                var innerText = document.getElementById("Point").innerText;
                //noinspection JSValidateTypes
                if (parseInt(innerText)>0) {
                    document.getElementById("Agility").innerHTML = parseInt(elementById) + 1;
                    document.getElementById("Point").innerHTML = parseInt(innerText)-1;
                    document.getElementById("Defense").innerHTML = split[1];
                    document.getElementById("Attack").innerHTML = split[0];
                }
            }
        });
            }});

});