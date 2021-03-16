import java.util.Scanner;
import java.util.Vector;

public class Main {
	int get_Index(String nim,Vector <Student> x)
	{
		int idx = -1;
		for(int i=0;i<x.size();i++)
		{
			if(x.get(i).getNim().equals(nim)) return i;
		}
		return idx;
	}
	
	public Main() {
		int choose=0;
		String nama,nim,noHp;
		Vector<Student>students = new Vector<>();
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("Student Management System");
			System.out.println("==============================");
			System.out.println("1. Add Student");
			System.out.println("2. Delete Student");
			System.out.println("3. View Student");
			System.out.println("4. Exit");
			System.out.print("input : ");
			choose = scan.nextInt();scan.nextLine();
			switch(choose)
			{
				case 1:
					do
					{
						System.out.print("NIM (10 Digit) : ");
						nim= scan.nextLine();
					}while(nim.length()<10);
					System.out.print("Name : ");
					nama = scan.nextLine();
					System.out.print("Phone Number : ");
					noHp = scan.nextLine();
					Student tmp = new Student(nama,nim,noHp);
					students.add(tmp);
					break;
				case 2:
					do
					{
						System.out.print("Input NIM : ");
						nim= scan.nextLine();
					}while(nim.length()!=10);
					int idxDel = get_Index(nim,students);
					if(idxDel==-1) System.out.println(nim+" you entered is not found");
					else
					{
						System.out.println(students.get(idxDel).getNama()+"("+nim+") has been deleted");
						students.remove(idxDel);
					}
					break;
				case 3:
					System.out.println("List of Students");
					System.out.println("=======================");
					for(int i=0;i<students.size();i++)
					{
						System.out.println(students.get(i).getNama());
					}
					break;
				case 4:
					break;
			}
		}while(choose!=4);
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
