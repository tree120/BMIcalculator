<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link rel="stylesheet" href="style.css" />
    <title>BMI Calculator</title>
  </head>
  <body>
    <div class="container">
      <header>
        <h1>BMI Calculator</h1>
        <p>Calculate your Body Mass Index (BMI) and understand your health better.</p>
      </header>

      <form >
        <div class="form-group">
          <label for="height">Height (cm):</label>
          <input type="text" id="height" placeholder="Enter your height" required />
        </div>
        <div class="form-group">
          <label for="weight">Weight (kg):</label>
          <input type="text" id="weight" placeholder="Enter your weight" required />
        </div>
        <button >Calculate BMI</button>
      </form>

      <div id="results" class="results">
        <h3>Your BMI: <span id="bmi-value">--</span></h3>
        <p id="msg"></p>
      </div>

      <div id="weight-guide" class="weight-guide">
        <h3>BMI Weight Guide</h3>
        <ul>
          <li><strong>Underweight:</strong> Less than 18.6</li>
          <li><strong>Normal Range:</strong> Between 18.6 and 24.9</li>
          <li><strong>Overweight:</strong> Greater than 24.9</li>
        </ul>
      </div>
    </div>

    <script src="script.js"></script>
  </body>
</html>
