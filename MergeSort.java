import java.util.*;

public class MergSort {

public static void mergeSort(int[] array) {

if (array.length &gt; 1) {

int[] left = leftHalfArray(array);

int[] right = rightHalfArray(array);

mergeSort(left);

mergeSort(right);

merge(array, left, right);

}

}

public static int[] leftHalfArray(int[] array) {

int lSize = array.length / 2;

int[] left = new int[lSize];

System.arraycopy(array, 0, left, 0, lSize);

return left;

}

public static int[] rightHalfArray(int[] array) {

int size1 = array.length / 2;

int rSize = array.length - size1;

int[] right = new int[rSize];

for (int i = 0; i &lt; rSize; i++) {

right[i] = array[i + size1];

}

return right;

}

public static void merge(int[] result,

int[] left, int[] right) {

int lIndex = 0;

int rIndex = 0;

for (int j = 0; j &lt; result.length; j++) {

if (rIndex &gt;= right.length || (lIndex &lt; left.length &amp;&amp;

left[lIndex] &lt;= right[rIndex])) {

result[j] = left[lIndex];

lIndex++;

} else {

result[j] = right[rIndex];

rIndex++;

}

}

}

public static void main(String[] args) {

int[] list = {14, 4, 84,71,54,15,51,72,87,25,32,75,14,34,79,80};

System.out.println(&quot;List Array of &#39;A&#39; Before SORT : &quot; + Arrays.toString(list));



mergeSort(list);

System.out.println(&quot;List Array of &#39;A&#39; After SORT : &quot; + Arrays.toString(list));

}

}
