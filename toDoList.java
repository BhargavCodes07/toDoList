void main() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> tasks = new ArrayList<>();

    while (true) {
        IO.println("===== TO-DO LIST =====");
        IO.println("1. Add Task");
        IO.println("2. View Tasks");
        IO.println("3. Remove Task");
        IO.println("4. Exit");
        IO.println("Choose an option: ");

        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == 4) break;
        else if (option == 1) {
            IO.println("Write Your Task : ");
            String task = scanner.nextLine();
            tasks.add(task);

        } else if (option == 2) {
            if (tasks.isEmpty()) {
                IO.println("No tasks left");
            } else {
                IO.println("Pending Task List : ");

                for (int i = 0; i < tasks.size(); i++) {
                    IO.println((i + 1) + ". " + tasks.get(i));
                }
            }

        } else if (option == 3) {
            IO.println("Enter The Task Number To Remove : ");
            int removeOption = scanner.nextInt();
            scanner.nextLine();

            int index = removeOption - 1;

            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
                IO.println("Task " + removeOption + " removed");
            } else {
                IO.println("Invalid task number");
            }

        } else {
            IO.println("Wrong Input");
        }
        scanner.close();
    }
}
