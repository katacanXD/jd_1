package JavaCore_1_2_Lambda_Worker.src;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
