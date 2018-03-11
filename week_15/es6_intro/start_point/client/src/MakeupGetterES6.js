class MakeupGetterES6 {

constructor(brand) {
  this.brand = brand;
  this.products = [];
}

fetchProducts() {
  const url = `http://makeup-api.herokuapp.com/api/v1/products.json?brand=${this.brand}`;


  const xhr = new XMLHttpRequest();
  xhr.open("GET", url);

  // xhr.onload = function(){
  //   this.products =JSON.parse(xhr.responseText);
  // }.bind(this)

  xhr.onload = () => {
    this.products = JSON.parse(xhr.responseText);

    for(let product of this.products){
      console.log(product);
    }
  };

  xhr.send();

}


}

export default MakeupGetterES6;
// can also have export default at top line instead
