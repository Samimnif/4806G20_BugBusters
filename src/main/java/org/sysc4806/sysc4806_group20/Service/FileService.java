package org.sysc4806.sysc4806_group20.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

public class FileService {
    private Map<String, String> fileCache = new HashMap<>();
    
    public String readFile(String filePath) throws IOException {
        // If the file is already in cache, return it
        if (fileCache.containsKey(filePath)) {
            return fileCache.get(filePath);
        }

        // Otherwise, read the file and cache it
        String content = Files.readString(Path.of(filePath));
        fileCache.put(filePath, content);
        return content;
    }
}

