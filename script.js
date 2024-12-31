const form = document.querySelector('form');

form.addEventListener('submit', (e) => {
  e.preventDefault();
  const height = parseInt(document.querySelector('#height').value);
  const weight = parseInt(document.querySelector('#weight').value);
  const results = document.querySelector('#bmi-value');

  if (height === '' || height < 0 || isNaN(height)) {
    results.innerHTML = `Please enter valid height ${height}`;
  } else if (weight === '' || weight < 0 || isNaN(weight)) {
    results.innerHTML = `Please enter valid weight ${height}`;
  } else {
    const bmi = (weight / ((height * height) / 10000)).toFixed(2);
    results.innerHTML = `<span>${bmi}</span>`;
    const msg = document.querySelector('#msg');
    if (bmi < 18.6) {
      msg.innerHTML = `You are under weight!!!`;
    } else if (bmi > 24.9) {
      msg.innerHTML = `You are over weight!!!`;
    } else {
      msg.innerHTML = `Your weight is normal!!!`;
    }
  }
  document.querySelector('#height').value = '';
  document.querySelector('#weight').value = '';
});