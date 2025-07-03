// for loop
for (let i = 0; i < 5; i++) {
  console.log("Perulangan ke-" + i);
}


// while loop
let i = 0;
while (i < 5) {
  console.log("Perulangan ke-" + i);
  i++;
}


// do...while loop
let i = 0;
do {
  console.log("Perulangan ke-" + i);
  i++;
} while (i < 5);


// for...of loop
const angka = [10, 20, 30];

for (let n of angka) {
  console.log("Nilai: " + n);
}


// for...in loop
let mahasiswa = {
  nama: "Rafli",
  umur: 20,
  jurusan: "Ilmu Komputer"
};

for (let k in mahasiswa) {
  console.log(k + ": " + mahasiswa[k]);
}


// deklarasi fungsi
function sapa(nama) {
  console.log("Halo, Selamat pagi" + nama + "!");
}
sapa("Rafli");


// arrow fungsi
const tambah = (a, b) => {
  return a + b;
};

console.log(tambah(3, 4)); // Output: 7
// atau
const tambah = (a, b) => a + b;