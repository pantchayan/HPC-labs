public class test extends Thread {
    // Learning Multi Threading 
    public void run() {

        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                System.out.println("Index: "+ i + " - Thread :" + Thread.currentThread().getId());
            }
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    int[] arr = { 1, 2, 3, 4, 5, 1, 1, 1 };
    int tar = 1;

    public static void main(String args[]) {
        test test1 = new test();
        Thread t1 = new Thread(test1);

        t1.start();
    }

}