function createComputer(){
    var xhr = new XMLHttpRequest();

    var ram = document.getElementById('ram');
    var hdd = document.getElementById('hdd');
    var ssd = document.getElementById('ssd');
    var matherboard = document.getElementById('matherboard');
    var power_unit = document.getElementById('power_unit');
    var system_unit = document.getElementById('system_unit');
    var video_card = document.getElementById('video_card');
    var price = document.getElementById('price');

    var body = JSON.stringify({
        ram: ram.value,
        hdd: hdd.value,
        ssd: ssd.value,
        matherboard: matherboard.value,
        power_unit: power_unit.value,
        system_unit: system_unit.value,
        video_card: video_card.value,
        price: price.value,
    });


    xhr.open("POST", '/api/computer', true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onload = function () {
            if (xhr.readyState == 4 && xhr.status == "201") {
                    window.location.href = "";
            }
    };

    xhr.send(body);
}