package IVSEM_JFS;
class graph{
  public static void main(String[] args) {
      int arr[][]={

        {0,1,1,0,1},
        {0,0,0,1,0},
        {0,0,0,1,0},
        {0,0,0,0,0},
        {0,0,0,0,0}
      };
      int zero_cnt=0;
      int sink_cnt=0;
      for(int i=0;i<arr.length;i++){
        zero_cnt=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]==0){
                zero_cnt++;
            }
            if(zero_cnt ==arr.length){
              System.out.println("sink node ="+(char)(65+i));
              sink_cnt++;
            }

        }
      }
      System.out.println("total sink node ="+sink_cnt);

  }
}
//A-65
//a-97
//0-48
//9-57
//Esc-27
//Space-32
//Enter-13
//Tab-9
//Backspace-8
//Delete-127
//Shift-16
//Ctrl-17 
