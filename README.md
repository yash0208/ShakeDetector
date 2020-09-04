# ShakeDetector
Detect The Shake Using ShakeDetect Listner Android.


# Use The Library:
implementation 'com.squareup:seismic:1.0.2'

# Implementation
- In MainActivity.java
  
  - Import:  "import com.squareup.seismic.ShakeDetector;"
  
  - Implements
  
  implements ShakeDetector.Listener
  
  By Implementing Method You Will Get hearShake() method.
  
  @Override
  
    public void hearShake() 
   
   {
        Toast.makeText(MainActivity.this,"Shake Has Been Detected",Toast.LENGTH_SHORT).show();
    }
