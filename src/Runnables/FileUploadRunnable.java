package Runnables;

import java.io.File;

import static java.lang.String.format;

public class FileUploadRunnable implements FileOperationRunnable{

    private final File file;
    private final String url;

    public FileUploadRunnable(File file, String url) {

        this.file = file;
        this.url = url;
    }

    @Override
    public void run() {
        System.out.println(
                String.format("Start the upload of the file - %s to %s",
                        file.getAbsolutePath(),
                        url));
        AppUtils.sleep(1);
        System.out.println(
                String.format(
                        "Successfully uploaded the file - %s to %s in thread %s",
                        file.getAbsoluteFile(),
                        url,
                        Thread.currentThread().getName()
                )
        );
    }

}