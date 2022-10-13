class Producer extends Thread{
        Container q;
        Producer(Container q1){
                q=q1;
        }
        public void run(){
            int i=0;   //
            synchronized(q){
                while(true){
                    if(q.available==true){
                  	 	try{
                            q.wait();
		                }catch(InterruptedException e){
				
			            }
			        }
				    i++;
				    q.put(i);
				    System.out.println("Put "+i);
				    q.available=true;
				    q.notify();
			    }
		    }
	    }
}
