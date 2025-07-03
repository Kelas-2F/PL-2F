//Variabel
var nama = "Andi";
console.log(nama); // Output: Andi

let usia = 20;
console.log("Usia saya:", usia); // Output: Usia saya: 20

const PI = 3.14;
console.log("Nilai PI adalah:", PI); // Output: Nilai PI adalah: 3.14

//Tipe Data
    //String
    let namaLengkap = "Budi Santoso";
    console.log("Nama lengkap:", namaLengkap); // Output: Nama lengkap: Budi Santoso
    
    //Number
    let tinggiBadan = 170;
    let beratBadan = 65.5;
    console.log("Tinggi:", tinggiBadan, "cm"); // Output: Tinggi: 170 cm
    console.log("Berat:", beratBadan, "kg"); // Output: Berat: 65.5 kg
    
    //boolean
    let sudahLulus = true;
    console.log("Status kelulusan:", sudahLulus); // Output: Status kelulusan: true
    
    //Array
    let buah = ["Apel", "Jeruk", "Pisang"];
    console.log(buah[1]); // Output: Jeruk
    
    //Object
    let mahasiswa = {
        nama: "Rani",
        umur : 21,
        jurusan: "Teknik Informatika"
    };
    
    console.log(mahasiswa.nama); // Output: Rani
    
    //Fungtion
        function sapa() {
    console.log("Halo Dunia!");
    }
    sapa(); // Output: Halo Dunia!


//Aritmatika
let a = 10;
let b = 3;

console.log("Penjumlahan:", a + b); // 13
console.log("Pengurangan:", a - b); // 7
console.log("Perkalian:", a * b);   // 30
console.log("Pembagian:", a / b);   // 3.333...
console.log("Modulus:", a % b);     // 1
console.log("Pangkat:", a ** b);    // 1000

//Perbandingan
let x = 5;
let y = "5";

console.log(x == y);   // true (nilai sama)
console.log(x === y);  // false (tipe beda)
console.log(x != y);   // false
console.log(x !== y);  // true
console.log(x > 3);    // true
console.log(x <= 5);   // true

//Operator Logika
let login = true;
let passwordBenar = false;

console.log(login && passwordBenar); // false
console.log(login || passwordBenar); // true
console.log(!login);                 // false


//Contoh Operator
let nama = "Dozi";
let umur = 18;
const umurMinimal = 17;

let bolehDaftar = umur >= umurMinimal;
console.log("Apakah " + nama + " boleh daftar? " + bolehDaftar);
// Output: Apakah Dozi boleh daftar? true

//if, else
let nilai = 75;

if (nilai >= 90) {
  console.log("Grade: A");
} else if (nilai >= 80) {
  console.log("Grade: B");
} else if (nilai >= 70) {
  console.log("Grade: C");
} else {
  console.log("Grade: D");
}

//Percabangan/Switch
switch (ekspresi) {
  case nilai1:
    // kode jika ekspresi == nilai1
    break;
  case nilai2:
    // kode jika ekspresi == nilai2
    break;
  default:
    // kode jika tidak ada yang cocok
}
