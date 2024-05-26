const colorChangeButtonHalfSecond = document.getElementsByClassName("colorChangeHalfSecond")[0];
const colorChangeButtonTwoSeconds = document.getElementsByClassName("colorChangeTwoSeconds")[0];
const colorChangeButtonTenSeconds = document.getElementsByClassName("colorChangeTenSeconds")[0];
const resetButton = document.getElementsByClassName("reset")[0];
const backToWhiteButton = document.getElementsByClassName("backToWhite")[0];
const backgroundHue = document.getElementById("backgroundId");

colorChangeButtonHalfSecond.addEventListener("click", colorChangeEventHalfSecond);
colorChangeButtonTwoSeconds.addEventListener("click", colorChangeEventTwoSeconds);
colorChangeButtonTenSeconds.addEventListener("click", colorChangeEventTenSeconds);
resetButton.addEventListener("click", resetEvent);
backToWhiteButton.addEventListener("click", backToWhiteEvent);

function colorChangeEventHalfSecond(event) {
    timerIDHalfSecond = setInterval(changeColorHalfSecond,500);
    
}
function colorChangeEventTwoSeconds(event) {
    timerIDTwoSeconds = setInterval(changeColorTwoSeconds, 2000);
    
}
function colorChangeEventTenSeconds(event) {
    timerIDTenSeconds = setInterval(changeColorTenSeconds, 10000);
    
}

function resetEvent(event) {
    clearInterval(timerIDHalfSecond);
    clearInterval(timerIDTwoSeconds);
    clearInterval(timerIDTenSeconds);

}


function changeColorHalfSecond() {
    let red = Math.random() * 256;
    let green = Math.random() * 256;
    let blue = Math.random() * 256;
    backgroundHue.style.backgroundColor = `rgb(${red}, ${blue}, ${green})`;
}

function changeColorTwoSeconds() {
    let red = Math.random() * 256;
    let green = Math.random() * 256;
    let blue = Math.random() * 256;
    backgroundHue.style.backgroundColor = `rgb(${red}, ${blue}, ${green})`;
}

function changeColorTenSeconds() {
    let red = Math.random() * 256;
    let green = Math.random() * 256;
    let blue = Math.random() * 256;
    backgroundHue.style.backgroundColor = `rgb(${red}, ${blue}, ${green})`;
}


function backToWhiteEvent(event) {
    backgroundHue.style.backgroundColor = "white";
}

    