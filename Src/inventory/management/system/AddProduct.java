package inventory.management.system;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddProduct extends JFrame {

    JTextField productNameField, productIdField, quantityField, priceField, supplierField;
    JTextArea description;
    Button addProduct, clear, existingProduct, back;
    JComboBox<String> category;
    JPanel imagePanel;
    Canvas imgCanvas;

        // ! ── Constructor ────────────────────────────────────────────────────────────
    public AddProduct() {
        setLayout(null); // Set layout BEFORE adding components
        getContentPane().setBackground(new Color(214, 239, 163));
        ImageIcon image = new ImageIcon("Src\\Icons\\Logo.png");
        setIconImage(image.getImage());

        //! Get the screen size for the header width
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();

        JLabel header = new JLabel("ADD NEW PRODUCT", JLabel.CENTER);
        header.setFont(new Font("SansSerif", Font.BOLD, 55));
        header.setForeground(Color.WHITE);
        header.setBackground(new Color(30, 30, 60));
        header.setOpaque(true); // Make the label paint its background
        header.setBounds(1, 0, screenWidth, 100);
        add(header);

        JLabel productNamelbl = new JLabel("Product Name: ");
        productNamelbl.setFont(new Font("SansSerif", Font.BOLD, 26));
        productNamelbl.setForeground(Color.BLACK);
        productNamelbl.setBackground(getForeground());
        productNamelbl.setOpaque(true); // Make the label paint its background
        productNamelbl.setBounds(40, 180, 250, 30);
        add(productNamelbl);

        productNameField = new JTextField(25);
        productNameField.setFont(new Font("SansSerif", Font.BOLD, 16));
        productNameField.setBackground(Color.WHITE);
        productNameField.setForeground(Color.BLACK);
        productNameField.setBounds(350, 180, 350, 30);
        add(productNameField);

        JLabel productIdlbl = new JLabel("Product ID: ");
        productIdlbl.setFont(new Font("SansSerif", Font.BOLD, 26));
        productIdlbl.setForeground(Color.BLACK);
        productIdlbl.setBackground(getForeground());
        productIdlbl.setOpaque(true); // Make the label paint its background
        productIdlbl.setBounds(40, 240, 250, 30);
        add(productIdlbl);

        productIdField = new JTextField(25);
        productIdField.setFont(new Font("SansSerif", Font.BOLD, 16));
        productIdField.setBackground(Color.WHITE);
        productIdField.setForeground(Color.BLACK);
        productIdField.setBounds(350, 240, 350, 30);
        add(productIdField);

        JLabel quantitylbl = new JLabel("Quantity: ");
        quantitylbl.setFont(new Font("SansSerif", Font.BOLD, 26));
        quantitylbl.setForeground(Color.BLACK);
        quantitylbl.setBackground(getForeground());
        quantitylbl.setOpaque(true); // Make the label paint its background
        quantitylbl.setBounds(40, 300, 250, 30);
        add(quantitylbl);

        quantityField = new JTextField(25);
        quantityField.setFont(new Font("SansSerif", Font.BOLD, 16));
        quantityField.setBackground(Color.WHITE);
        quantityField.setForeground(Color.BLACK);
        quantityField.setBounds(350, 300, 350, 30);
        add(quantityField);

        JLabel pricelbl = new JLabel("Price (Rs): ");
        pricelbl.setFont(new Font("SansSerif", Font.BOLD, 26));
        pricelbl.setForeground(Color.BLACK);
        pricelbl.setBackground(getForeground());
        pricelbl.setOpaque(true); // Make the label paint its background
        pricelbl.setBounds(40, 360, 250, 30);
        add(pricelbl);

        priceField = new JTextField(25);
        priceField.setFont(new Font("SansSerif", Font.BOLD, 16));
        priceField.setBackground(Color.WHITE);
        priceField.setForeground(Color.BLACK);
        priceField.setBounds(350, 360, 350, 30);
        add(priceField);

        JLabel categorylbl = new JLabel("Category: ");
        categorylbl.setFont(new Font("SansSerif", Font.BOLD, 26));
        categorylbl.setForeground(Color.BLACK);
        categorylbl.setBackground(getForeground());
        categorylbl.setOpaque(true); // Make the label paint its background
        categorylbl.setBounds(40, 420, 250, 30);
        add(categorylbl);

        category = new JComboBox<String>(new String[] { "Select", "Hardware", "Grocery", "Shoes" });
        category.setFont(new Font("SansSerif", Font.BOLD, 16));
        category.setBackground(Color.WHITE);
        category.setForeground(Color.BLACK);
        category.setBounds(350, 420, 350, 30);
        add(category);

        JLabel supplierlbl = new JLabel("Supplier: ");
        supplierlbl.setFont(new Font("SansSerif", Font.BOLD, 26));
        supplierlbl.setForeground(Color.BLACK);
        supplierlbl.setBackground(getForeground());
        supplierlbl.setOpaque(true); // Make the label paint its background
        supplierlbl.setBounds(40, 480, 250, 30);
        add(supplierlbl);

        supplierField = new JTextField(55);
        supplierField.setFont(new Font("SansSerif", Font.BOLD, 16));
        supplierField.setBackground(Color.WHITE);
        supplierField.setForeground(Color.BLACK);
        supplierField.setBounds(350, 480, 350, 30);
        add(supplierField);

        JLabel descriptionlbl = new JLabel("Description: ");
        descriptionlbl.setFont(new Font("SansSerif", Font.BOLD, 26));
        descriptionlbl.setForeground(Color.BLACK);
        descriptionlbl.setBackground(getForeground());
        descriptionlbl.setOpaque(true); // Make the label paint its background
        descriptionlbl.setBounds(40, 540, 250, 30);
        add(descriptionlbl);

        description = new JTextArea(20, 30);
        description.setFont(new Font("SansSerif", Font.BOLD, 16));
        description.setBackground(Color.WHITE);
        description.setForeground(Color.BLACK);
        description.setBounds(350, 540, 350, 120);
        add(description);

        //! ------------- Label to show status ----------------------
        JLabel statuslbl = new JLabel("", JLabel.CENTER);
        statuslbl.setFont(new Font("SansSerif", Font.ITALIC, 14));
        statuslbl.setBackground(getForeground());
        statuslbl.setForeground(Color.RED);
        statuslbl.setBounds(300, 660, 400, 40);
        add(statuslbl);


        //! ------------- Buttons ----------------------
        addProduct = new Button("Add Product");
        addProduct.setFont(new Font("SansSerif", Font.BOLD, 18));
        addProduct.setBounds(350, 720, 150, 35);
        addProduct.setBackground(new Color(59, 130, 246));
        addProduct.setForeground(Color.WHITE);
        add(addProduct);

        clear = new Button("Clear");
        clear.setFont(new Font("SansSerif", Font.BOLD, 18));
        clear.setBounds(550, 720, 150, 35);
        clear.setBackground(Color.RED);
        clear.setForeground(Color.WHITE);
        add(clear);

        existingProduct = new Button("Manage Existing Product");
        existingProduct.setFont(new Font("SansSerif", Font.BOLD, 18));
        existingProduct.setBounds(350, 780, 350, 35);
        existingProduct.setBackground(Color.CYAN);
        existingProduct.setForeground(Color.BLACK);
        add(existingProduct);

        back = new Button("Back");
        back.setFont(new Font("SansSerif", Font.BOLD, 18));
        back.setBounds(1300, 820, 150, 35);
        back.setBackground(Color.CYAN);
        back.setForeground(Color.BLACK);
        add(back);

        //! ------------- Image Panel ----------------------
        imagePanel = new JPanel(null) {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(new Color(30, 41, 59));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
            }
        };

        imagePanel.setLayout(null);
        imagePanel.setBounds(780, 180, 700, 600);
        add(imagePanel);

        try {
            //! ------------- Trying to load the image from system ----------------------
            Image adminImg = Toolkit.getDefaultToolkit().getImage("Src/Icons/AddProduct.png");
            imgCanvas = new Canvas(null) {
                public void paint(Graphics g) {
                    g.drawImage(adminImg, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel.setLayout(null);
            imgCanvas.setBounds(0, 0, 700, 600);
            imagePanel.add(imgCanvas, Canvas.CENTER_ALIGNMENT);

        } catch (Exception e) {
            // Fallback: show placeholder if image not found
            JLabel placeholder = new JLabel("👨‍💼\nAdmin Image", JLabel.CENTER);
            placeholder.setFont(new Font("SansSerif", Font.BOLD, 24));
            placeholder.setForeground(new Color(56, 189, 248));
            placeholder.setBounds(20, 20, 340, 380);
            imagePanel.add(placeholder);
        }

        //! ======= Action Listeners ==========

        addProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productName = productNameField.getText().trim();
                String productId = productIdField.getText().trim();
                String quantity = quantityField.getText().trim();
                String price = priceField.getText().trim();
                String categoryinfo = (String) category.getSelectedItem();
                String supplierName = supplierField.getText().trim();
                String prodDescription = description.getText().trim();

                double priceValue = 0;
                int quantityValue = 0;

                //! ------------- Input validations ----------------------

                if (productName.isEmpty() || productId.isEmpty() || quantity.isEmpty() || price.isEmpty()
                        || categoryinfo.equals("Select") || supplierName.isEmpty() || prodDescription.isEmpty()) {
                    statuslbl.setText("Please fill all fields.");
                    return;
                }

                try {
                    priceValue = Double.parseDouble(price);
                    quantityValue = Integer.parseInt(quantity);
                } catch (Exception ex) {
                    statuslbl.setText("Invalid Price or Quantity format.");
                    return;
                }

                if (priceValue < 0) {
                    statuslbl.setText("Price should be positive number.");
                    return;
                }

                if(quantityValue < 0){
                    statuslbl.setText("Quantity could not be negative.");
                    return;
                }

                try {

                    statuslbl.setText("Adding Product.......");
                    // TODO: Logic to add product into Database

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productNameField.setText("");
                productIdField.setText("");
                quantityField.setText("");
                priceField.setText("");
                category.setSelectedIndex(0);
                supplierField.setText("");
                description.setText("");
                statuslbl.setText("");
                return;
            }
        });

        existingProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Connecting it to new page where existing product inventory is managed.

            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new AdminFeatures();

            }
        });

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddProduct();
    }
}
