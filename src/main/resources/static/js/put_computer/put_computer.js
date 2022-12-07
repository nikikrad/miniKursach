function putComputer(){
    var xhr = new XMLHttpRequest();

    var ram = document.getElementById('ramPut');
        var hdd = document.getElementById('hddPut');
        var ssd = document.getElementById('ssdPut');
        var matherboard = document.getElementById('matherboardPut');
        var power_unit = document.getElementById('power_unitPut');
        var system_unit = document.getElementById('system_unitPut');
        var video_card = document.getElementById('video_cardPut');
        var price = document.getElementById('pricePut');

    var body = JSON.stringify({
        id : ID,
         ram: ram.value,
                hdd: hdd.value,
                ssd: ssd.value,
                matherboard: matherboard.value,
                power_unit: power_unit.value,
                system_unit: system_unit.value,
                video_card: video_card.value,
                price: price.value,
    });

    xhr.open("PUT", '/api/computer', true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onload = function () {
            if (xhr.readyState == 4 && xhr.status == "201") {
                    window.location.href = "";
            }
    };

    xhr.send(body);
}
var ID = 0;

 function setComputerId(id){
    ID = id;
 }
