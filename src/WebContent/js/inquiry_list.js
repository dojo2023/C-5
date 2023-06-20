// 対応ステータスのセルをクリックしたときの処理
document.addEventListener("DOMContentLoaded", function() {
  var statusCells = document.querySelectorAll(".status-cell");

  statusCells.forEach(function(cell) {
    cell.addEventListener("click", function() {
      var currentStatus = this.dataset.status;
      var newStatus = getNextStatus(currentStatus);

      // サーバーに新しいステータスを送信するなど、必要な処理を行うことができます

      // ステータスを更新して表示する
      this.textContent = getStatusText(newStatus);
      this.dataset.status = newStatus;
    });
  });
});

// ステータスを切り替える関数
function getNextStatus(currentStatus) {
  var statuses = ["0", "1", "2"];
  var currentIndex = statuses.indexOf(currentStatus);
  var nextIndex = (currentIndex + 1) % statuses.length;
  return statuses[nextIndex];
}

// ステータスに対応するテキストを返す関数
function getStatusText(status) {
  switch (status) {
    case "0":
      return "未対応";
    case "1":
      return "対応中";
    case "2":
      return "対応済み";
    default:
      return "";
  }
}