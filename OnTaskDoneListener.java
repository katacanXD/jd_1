package JavaCore_1_2_Lambda_Worker.src;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
