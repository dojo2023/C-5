// 行をクリックした際にポップアップを表示する関数
function showPopup() {
  var popupRow = document.getElementById("popupRow");
  popupRow.style.display = "block";
}

// 行をクリックした際にポップアップを非表示にする関数
function hidePopup() {
  var popupRow = document.getElementById("popupRow");
  popupRow.style.display = "none";
}

// 行をクリックした際にポップアップを制御するイベントハンドラを追加
var row = document.getElementById("popupRow");
row.addEventListener("click", function() {
  var popupVisible = (row.style.display === "block");
  if (popupVisible) {
    hidePopup();
  } else {
    showPopup();
  }
});