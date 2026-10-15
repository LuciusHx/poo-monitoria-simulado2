class Main {
    public static void main(String[] args){
        ClienteVip cliente = new ClienteVip("lucius", "123456", "lc@gmail.com", "rua", 0.20);
        System.out.println(cliente);

        Cliente c2 = new Cliente("luis", "123333", "luis123@gmail", "avenida");
        System.out.println(c2);
    }
}