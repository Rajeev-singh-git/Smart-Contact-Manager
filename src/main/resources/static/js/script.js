console.log("Script loaded");

//change theme  work
let currentTheme = getTheme();

//initial -->

document.addEventListener("DOMContentLoaded", () => {
  changeTheme();
});

//Todo:
function changeTheme() {
  //set to web page

  changePageTheme(currentTheme, currentTheme);

  //set the listener to change theme button
  const changeThemeButton = document.querySelector("#theme_change_button");
  changeThemeButton.querySelector("span").textContent =
    currentTheme == "light" ? "Dark" : "Light";
  const oldTheme = currentTheme;

  changeThemeButton.addEventListener("click", (event) => {
    console.log("Change theme button clicked");
    //remove the current theme
    document.querySelector("html").classList.remove(currentTheme);
    if (currentTheme == "dark") {
      currentTheme = "light";
    } else {
      currentTheme = "dark";
    }

    changePageTheme(currentTheme, oldTheme);
  });
}
//set theme to localstorage
function setTheme(theme) {
  localStorage.setItem("theme", theme);
}

//get theme from localstorage
function getTheme() {
  let theme = localStorage.getItem("theme");
  return theme ? theme : "light";
}

//change current page theme
function changePageTheme(theme, oldTheme) {
  //update in local storage
  setTheme(currentTheme);
  //remove the current theme
  document.querySelector("html").classList.remove(oldTheme);
  //set the current theme
  document.querySelector("html").classList.add(theme);

  //change the text of the button
  document
    .querySelector("#theme_change_button")
    .querySelector("span").textContent = theme == "light" ? "Dark" : "Light";
}

//end of change theme work
