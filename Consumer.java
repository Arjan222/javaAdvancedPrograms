class Consumer extends Thread{
        Container q;
        Consumer(Container q1){
                q=q1;
        }
        public void run(){
        
          synchronized(q){
			while(true){
                if(q.available==false){
                    try{
                        q.wait();
                    }catch(InterruptedException e){
                    }
                }
                System.out.println("Got "+q.get());
                q.available=false;
                q.notify();
            }
        }
    }
}
