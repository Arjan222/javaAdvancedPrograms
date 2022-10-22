class Main {
        public static void main(String ar[]){
                Container q1=new Container();
                Producer p =new Producer(q1);
                Consumer c=new Consumer(q1);
                c.start();
                p.start();
        }
}
/* For multiple consumers, concept of BlockingQueue can be used*/