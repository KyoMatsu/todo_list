// checkboxの取得
let checks = document.querySelectorAll('.form-check-input');
// submitするformの取得
let form = document.getElementById('status_form');
// post時にidを埋め込むhiddenの取得
let hidden = document.querySelector('input[name="comp_id"]');

// イベントリスナの設定（クリック時に発火するイベントを各チェックボックスに設定）
checks.forEach((v) => v.addEventListener('click', (e) => {
	e.preventDefault();
	hidden.value = e.target.dataset.id;
	form.submit();
}));