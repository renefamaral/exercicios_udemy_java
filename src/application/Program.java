package application;

import entitites.Employees;
import entitites.Order;
import enums.OrderStatus;

import javax.sound.midi.spi.SoundbankReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt(); // Ex de vetor do tipo primitivo (chamado de vetor tipo valor)
//        double[] vect = new double[n];
//        for (int i = 0; i < n; i ++){
//            System.out.println("Enter the vector number.");
//            vect[i] = sc.nextDouble();
//        }
//
//        double sum = 0;
//
//        for (int i = 0; i < n; i++){
//            sum += vect[i];
//        }
//
//        double avg = sum / n;
//
//        System.out.printf("%.2f%n", avg);

        /**
         * Abaixo segundo exercício com vetores de classes (chamado de vetor tipo referência)
         */

//        int n = sc.nextInt();
//        Product[] vect = new Product[n];
//
//        for (int i = 0; i < vect.length; i++){
//            sc.nextLine();
//            String name = sc.nextLine();
//            double price = sc.nextDouble();
//            vect[i] = new Product(name, price);
//        }
//
//        double sum = 0;
//
//        for (int i = 0; i < vect.length; i++){
//            sum += vect[i].getPrice();
//        }
//
//        double avg = sum / vect.length;
//
//        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        /**
         * Exercício de fixação aula n° 90 udemy Nelio Alves
         */

//        System.out.print("How many rooms will be rented? ");
//        int n = sc.nextInt();
//        Product[] vect = new Product[10];
//
//        for (int i = 0; i < n; i ++){
//            sc.nextLine();
//            System.out.print("Enter name guest: ");
//            String name = sc.nextLine();
//            System.out.print("Enter email guest: ");
//            String email = sc.nextLine();
//            System.out.print("Enter number room: ");
//            int room = sc.nextInt();
//            vect[room] = new Product(name, email);
//            System.out.println();
//        }
//
//        System.out.println("Busy rooms: ");
//        for (int i = 0; i < vect.length; i++){
//            if (vect[i] != null){
//                System.out.println(i + ": " + vect[i].getName()+ ", " + vect[i].getEmail());
//            }
//        }

        /**
         * Aula 93, listas na prática
         *
         * Tamanho da lista: size()
         * Inserir elemento na lista: add(obj), add(int, obj)
         * Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
         * Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
         * Filtrar lista com base em predicado: List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
         * Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
         *
         */

//        List<String> list = new ArrayList<>();
//
//        list.add("Maria");
//        list.add("Alex");
//        list.add("Bob");
//        list.add("Anna");
//        list.add(2, "Marco");
//
//        System.out.println(list.size());
//
//        for(String x : list){
//            System.out.println(x);
//        }
//
//        System.out.println("----------------------------");
//        list.remove("Anna");
//        list.remove(1);
//        list.removeIf(x -> x.charAt(0) == 'M'); // Predicado - neste caso utilizado para remover todos os nomes que iniciavam com a letra M maiúscula.
//
//        for(String x : list){
//            System.out.println(x);
//        }
//
//        System.out.println("------------------------------");
//        System.out.println("Index of Bob: " + list.indexOf("Bob"));
//        System.out.println("Index of Bob: " + list.indexOf("Marco"));
//
//
//        System.out.println("------------------------");
//        list.add("Maria");
//        list.add("Alex");
//        list.add("Anna");
//        list.add("Marco");
//
//        list.removeIf(x -> x.charAt(0) != 'M');
//
//        for(String x : list){
//            System.out.println(x);
//        }
//
//        System.out.println("-----------------");
//        list.add("Alex");
//        list.add("Anna");
//
//        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // cria uma nova lista de resultados filtrando a expressão desejada e convertendo novamente em lista
//        for(String x : result){
//            System.out.println(x);
//        }
//
//        System.out.println("------------------------");
//        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // encontra o primeiro elemento cujo nome começa com A
//        String name1 = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null); // encontra o primeiro nome cujo elemento começa com J, neste caso não há, portanto retornou nulo.
//        System.out.println(name);
//        System.out.println(name1);


        /**
         * Exercise 95.
         */

//        System.out.print("How many employees will be registered: ");
//        int n = sc.nextInt();
//
//        List<Employees> list = new ArrayList<>();
//
//        for (int i = 0; i < n; i ++){
//            System.out.println("\nEmployee #" + (i + 1));
//            System.out.print("Id:  ");
//            Integer id = sc.nextInt();
//            sc.nextLine();
//            System.out.print("Name: ");
//            String name = sc.nextLine();
//            System.out.print("Salary: ");
//            Double salary = sc.nextDouble();
//
//            Employees emp = new Employees(id, name, salary);
//            list.add(emp);
//        }
//
//        System.out.println();
//        System.out.print("Enter the employee id that will have salary increase: ");
//        int idSalary = sc.nextInt();
//
//        Employees emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
//
//        //Integer pos = position(list, idSalary); 1° forma de busca com base na função abaixo, desta forma é mais verboso
//
//        if (emp == null){
//            System.out.println("This id doesn't exist!");
//        }
//        else {
//            System.out.print("Enter the percentage: ");
//            double percent = sc.nextDouble();
//            emp.increaseCalculation(percent);
//        }
//
//        System.out.println();
//        System.out.println("List of employees: ");
//        for (Employees e : list){
//            System.out.println(e);
//        }
//
//        sc.close();
//    }
//
//    public static int position(List<Employees> list, int id){
//        for (int i = 0; i < list.size(); i++){
//            if (list.get(i).getId() == id){
//                return i;
//            }
//        }
//        return -1;

        /**
         * Aula 98 Matriz exercício resolvido
         */


//        System.out.println("informe o tamanho da Matriz (n por n): ");
//        int n = sc.nextInt();
//        int[][] mat = new int[n][n];
//
//        for (int i = 0; i < mat.length; i++){
//            for (int j = 0; j < mat[i].length; j++){
//                mat[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Main diagonal: ");
//        for (int i = 0; i < mat.length; i++){
//            System.out.print(mat[i][i] + " ");
//        }
//
//        int cont = 0;
//        for (int i = 0; i < mat.length; i++){
//            for (int j = 0; mat[i].length < n; j ++) {
//                if (mat[i][j] < 0) {
//                    cont ++;
//                }
//            }
//        }
//
//        System.out.println("Negative numbers = " + cont);;


        /**
         * Aula 99 Exercício Propostos (Matriz)
         */

//        int m, n, x;
//        System.out.println("Informe a quantidade de linhas: ");
//        m = sc.nextInt();
//        System.out.println("Informe a quantidade de colunas: ");
//        n = sc.nextInt();
//
//        int mat[][] = new int[m][n];
//
//        System.out.println("Entre com os números da matriz: ");
//
//        for (int i = 0; i < mat.length; i ++){
//            for (int j = 0; j < mat[i].length; j ++){
//                mat[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Digite o número que será procurado: ");
//        x = sc.nextInt();
//
//        for (int i = 0; i < mat.length; i ++){
//            for (int j = 0; j < mat[i].length; j++){
//                if(x == mat[i][j]){
//                    System.out.println("Position " + i + ", " + j);
//                    if (j > 0){
//                        System.out.println("Left: " + mat[i][j-1]);
//                    }
//                    if (i > 0){
//                        System.out.println("Up: " + mat[i-1][j]);
//                    }
//                    if (j < mat[i].length-1){
//                        System.out.println("Right: " + mat[i][j+1]);
//                    }
//                    if (i < mat[i].length-1){
//                        System.out.println("Down: " + mat[i+1][j]);
//                    }
//                }
//            }
//        }

        /**
         * Trabalhando com datas Aula 101
         */

//        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // Formatando horário padrão GMT - 03 horas a mais que o Brasil // GMT = Grenwich
//
//        Date x1 = new Date(); // 1° forma de criar uma data com horário atual.
//        Date x2 = new Date(System.currentTimeMillis()); // 2° forma de criar uma data com hora atualizada.
//        Date x3 = new Date(0L); // Passando como parâmetro 0 milessgundos. Com isso ele dá a data do início da contagem pelo Java, contudo com três horas de atraso por estarmos no Brasil.
//        Date x4 = new Date(1000L * 60 * 60 * 5); // Criando um horário às 05:00 (02:00 horário Brasil) da manhã do dia 01/01/1970.
//
//
//        Date y1 = sdf1.parse("25/06/2018");
//        Date y2 = sdf2.parse("25/06/2018 15:42:07");
//        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Data padrão ISO 8601 no horário dá máquina (Brasil).
//
//        System.out.println("x1: " + x1); // impressão de tada sem formatação.
//        System.out.println("x2: " + x2);
//        System.out.println("x3: " + x3);
//        System.out.println("x4: " + x4);
//        System.out.println("y1: " + y1);
//        System.out.println("y2: " + y2);
//        System.out.println("y3: " + y3); // fim da impressão de data sem formatação.
//        System.out.println("--------------------------------");
//        System.out.println("x1: " + sdf2.format(x1));
//        System.out.println("x2: " + sdf2.format(x2));
//        System.out.println("x3: " + sdf2.format(x3));
//        System.out.println("x4: " + sdf2.format(x4));
//        System.out.println("y1: " + sdf2.format(y1));
//        System.out.println("y2: " + sdf2.format(y2));
//        System.out.println("y3: " + sdf2.format(y3));
//        System.out.println("--------------------------------");
//        System.out.println("x1: " + sdf3.format(x1));
//        System.out.println("x2: " + sdf3.format(x2));
//        System.out.println("x3: " + sdf3.format(x3));
//        System.out.println("x4: " + sdf3.format(x4));
//        System.out.println("y1: " + sdf3.format(y1));
//        System.out.println("y2: " + sdf3.format(y2));
//        System.out.println("y3: " + sdf3.format(y3));

        /**
         * Aula 102 Manipulando Date com Calendar
         */

//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//
//        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
//
//        System.out.println(sdf.format(d));
//
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(d);
////        cal.add(Calendar.HOUR_OF_DAY, 4); // adicionando 04 horas.
////        d = cal.getTime();
////        System.out.println(sdf.format(d));
//
//        int minutes = cal.get(Calendar.MINUTE); // extraindo os minutis de uma determinada data.
//        int month = cal.get(Calendar.MONTH); // o Calendar considera que janeiro é 0, fevreiro 1, março 2, etc...
//        int month1 = 1 + cal.get(Calendar.MONTH); // para mostrar o mês correto basta acrescentar 1 + cal.get conforme esse exemplo
//
//        System.out.println("Minutes: " + minutes);
//        System.out.println("Month: " + month);
//        System.out.println("Month: " + month1);

        /**
         * Aula 114 enumerações
         */

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");


        System.out.println(os1);
        System.out.println(os2);




        sc.close();
    }
}
