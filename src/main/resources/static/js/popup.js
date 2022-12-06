 let popupbg = document.querySelector(.'popup_bg');
        let popup = document.querySelector(.'popup');
        let openPup = document.querySelector(.'open-popup');

        openPup.forEach((button) => {
        button.addEventListener('click' (e) =>
        {
            e.preventDefault();
            popupbg.classList.add('active');
        })

        });
