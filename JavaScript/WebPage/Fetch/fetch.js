async function logJSONData() {
    const response =  fetch("http://worldtimeapi.org/timezone/Asia/Tokyo");
    const jsonData = await response.json();
    console.log(jsonData);
  }