

import android.content.BroadcastReceiver;

//�̳�BroadcastReceiver����дonReceiver���������й㲥���մ���
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