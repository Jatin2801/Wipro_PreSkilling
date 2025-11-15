fetch("https://dummy.restapiexample.com/api/v1/employees")
  .then(response => {
    if (!response.ok) {
      throw new Error("Network response was not ok " + response.statusText);
    }
    return response.json();
  })
  .then(data => {
    console.log("Employee Data Retrieved Successfully:");
    console.log(data);
  })
  .catch(error => {
    console.error("Error fetching data:", error);
  });
