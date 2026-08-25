// 5. Covariant Return Types with Range Validation
// Scenario: Base class DocumentCreator has a method Document createDocument(String type).
// Subclass SecureDocumentCreator overrides this method using a covariant return type (SecurePDFDocument instead of Document).

public class CovarientReturn {
    public static void main(String[] args) {
        SecureDocumentCreator secureCreator = new SecureDocumentCreator();

        System.out.println("--- Test 1: Valid PDF ---");
        SecurePDFDocument doc1 = secureCreator.createDocument("PDF");
        doc1.displayInfo();

        System.out.println("\n--- Test 2: Valid EXCEL ---");
        SecurePDFDocument doc2 = secureCreator.createDocument("EXCEL");
        doc2.displayInfo();

        System.out.println("\n--- Test 3: Invalid Type (Fallback) ---");
        SecurePDFDocument doc3 = secureCreator.createDocument("UNKNOWN_TYPE");
        doc3.displayInfo();

        System.out.println("\n--- Test 4: Polymorphic Reference Demonstration ---");
        DocumentCreator polyCreator = new SecureDocumentCreator();
        // Overridden method is called at runtime, returning SecurePDFDocument
        Document doc4 = polyCreator.createDocument("WORD");
        doc4.displayInfo();
    }
}

// Base Document class
class Document {
    String type;

    Document(String type) {
        this.type = type;
    }

    void displayInfo() {
        System.out.println("Standard Document created: " + type);
    }
}

// Subclass of Document
class SecurePDFDocument extends Document {
    String securityLevel;

    SecurePDFDocument(String type, String securityLevel) {
        super(type);
        this.securityLevel = securityLevel;
    }

    @Override
    void displayInfo() {
        System.out.println("Secure Document created -> Type: " + type + ", Security: " + securityLevel);
    }
}

// Base Document Creator
class DocumentCreator {
    Document createDocument(String type) {
        System.out.println("[DocumentCreator] Creating standard document...");
        return new Document(type);
    }
}

// Subclass with Covariant Return Type: returns SecurePDFDocument instead of Document
class SecureDocumentCreator extends DocumentCreator {

    @Override
    SecurePDFDocument createDocument(String type) {
        // If-else-if ladder for type validation
        if ("PDF".equalsIgnoreCase(type)) {
            return new SecurePDFDocument("PDF", "AES-256 Encryption");
        } else if ("EXCEL".equalsIgnoreCase(type)) {
            return new SecurePDFDocument("EXCEL", "Password Protection");
        } else if ("WORD".equalsIgnoreCase(type)) {
            return new SecurePDFDocument("WORD", "Restricted Editing");
        } else {
            // Fallback to a default secure document instance if invalid type is passed
            System.out.println("Invalid type '" + type + "' passed! Falling back to default Secure PDF document.");
            return new SecurePDFDocument("DEFAULT_PDF", "Standard Secure Encryption");
        }
    }
}