$(document).ready(function (div) {

    $("#wrapper").css({
        'width': $('#wrapper').find('img').width(),

        'height': $('#wrapper').find('img').height()

    })
    var tooltipDirection;
    for (var i = 0; i < $(".pin").length; i++) {
        if ($(".pin").eq(i).hasClass('pin-down')) {

            tooltipDirection = 'tooltip-down';

        } else {
            tooltipDirection = 'tooltip-up';
        }
        $("#wrappe+r").append("<div style='left:" + $('.pin').eq(i).data('xpos') + "px;top:" + $(".pin").eq(i).data('ypos') + "px' class='" + tooltipDirection +
            "<div class ='tooltip'>" + $(".pin").eq(i).html() + "</div>")
    }

    $('.tooltip-up, .tooltip-down').mouseenter(function () {

        //noinspection JSValidateTypes
        $(this).children('.tooltip').fadeIn(100);

    }).mouseleave(function () {

        //noinspection JSValidateTypes
        $(this).children('.tooltip').fadeOut(100);

    })

});
