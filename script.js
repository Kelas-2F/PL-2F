// Ini DOM
const taskInput = document.getElementById("taskInput");
const addTaskBtn = document.querySelector("#addTaskBtn");
const taskList = document.querySelector("#taskList");

addTaskBtn.addEventListener("click", () => {
  const taskText = taskInput.value.trim();
  if (taskText !== "") {
    addTask(taskText);
    taskInput.value = "";
  }
});

function addTask(text) {
  // Ini buat bikin task / todo baru
  const li = document.createElement("li");
  li.textContent = text; 
  li.classList.add("task-item");

  // Tambahkan tombol hapus
  const deleteBtn = document.createElement("button");
  deleteBtn.textContent = "Hapus";
  deleteBtn.classList.add("delete-btn");
  deleteBtn.style.marginLeft = "10px"; 

  li.appendChild(deleteBtn);

  taskList.appendChild(li);

  deleteBtn.addEventListener("click", () => {
    li.remove(); // Menghapus elemen
  });

  li.addEventListener("click", (e) => {
    if (e.target === deleteBtn) return;

    li.classList.toggle("done");
    li.style.textDecoration = li.classList.contains("done")
      ? "line-through"
      : "none";
  });
}
