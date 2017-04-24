 $(document).ready(function(){
        // Устанавливаем ширину и высоту контейнера в соответствии с размерами изображения
        $("#wrapper").css({'width':$('#wrapper').find('img').width(),
            'height':$('#wrapper img').height()
        })
        //Направление символа подсказки
        var tooltipDirection;
        for (i=0; i<$('.pin').length; i++)
        {
            // Устанавливаем направление символа подсказки - вверх или вниз
            if ($(".pin").eq(i).hasClass('pin-down')) {
                tooltipDirection = 'tooltip-down';
            } else {
                tooltipDirection = 'tooltip-up';
            }
            // Добавляем подсказку
            $("#wrapper").append("<div style='left:"+$(".pin").eq(i).data('xpos')+"px;top:"+$(".pin").eq(i).data('ypos')+"px' class='" + tooltipDirection +'\'>\
                <div class=\'tooltip\'>' + $(".pin").eq(i).html() + "</div>\
                </div>");
        }
        // Выводим/скрываем подсказку
        $('.tooltip-up, .tooltip-down').mouseenter(function(){
            $(this).children('.tooltip').fadeIn(100);
        }).mouseleave(function(){
            $(this).children('.tooltip').fadeOut(100);
        })
    });
