

import android.content.BroadcastReceiver;

//继承BroadcastReceiver，重写onReceiver方法，进行广播接收处理。
    class NetworkChangeReceiver extends BroadcastReceiver{
 
        @Override
        public void onReceive(Context context, Intent intent) {
            // TODO Auto-generated method stub
            ConnectivityManager connectivityManager=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
            if(networkInfo!=null&&networkInfo.isAvailable()){
                Toast.makeText(context, "network is Available",
                        Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(context, "network is unAvailable",
                        Toast.LENGTH_LONG).show();
            }
             
        }
         
    }