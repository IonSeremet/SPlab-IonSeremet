package com.example.designpatternslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DesignPatternsLab2Application {

    public static void main(String[] args) throws Exception{
//        SpringApplication.run(DesignPatternsLab2Application.class, args);
//        Book discoTitanic = new Book("Disco Titanic");
//        Author author = new Author("Radu Pavel Gheo");
//        discoTitanic.addAuthor(author);
//        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
//        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
//        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
//        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
//        scOneOne.createNewParagraph("Paragraph 1");
//        scOneOne.createNewParagraph("Paragraph 2");
//        scOneOne.createNewParagraph("Paragraph 3");
//        scOneOne.createNewImage("Image 1");
//        scOneOne.createNewParagraph("Paragraph 4");
//        scOneOne.createNewTable("Table 1");
//        scOneOne.createNewParagraph("Paragraph 5");
//        scOneOne.print();
//        ------------------------------------------------------
//        Book noapteBuna = new Book("Noapte buna, copii!");
//        Author rpGheo = new Author("Radu Pavel Gheo");
//        noapteBuna.addAuthor(rpGheo);
//
//        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
//
//        Section cap1 = new Section("Capitolul 1");
//        noapteBuna.addContent(cap1);
//
//        cap1.add(new Paragraph("Moto capitol"));
//
//        Section cap11 = new Section("Capitolul 1.1");
//        cap1.add(cap11);
//
//        cap11.add(new Paragraph("Text from subchapter 1.1"));
//
//        Section cap111 = new Section("Capitolul 1.1.1");
//        cap11.add(cap111);
//
//        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
//
//        Section cap1111 = new Section("Subchapter 1.1.1.1");
//        cap111.add(cap1111);
//
//        cap1111.add(new Image("Image subchapter 1.1.1.1"));
//
//        noapteBuna.print();
//        ------------------------------------------------------
//        long startTime = System.currentTimeMillis();
//        ImageProxy img1 = new ImageProxy("Pamela Anderson");
//        ImageProxy img2 = new ImageProxy("Kim Kardashian");
//        ImageProxy img3 = new ImageProxy("Kirby Griffin");
//        Section playboyS1 = new Section("Front Cover");
//        playboyS1.add(img1);
//        Section playboyS2 = new Section("Summer Girls");
//        playboyS2.add(img2);
//        playboyS2.add(img3);
//        Book playboy = new Book("Playboy");
//        playboy.addContent(playboyS1);
//        playboy.addContent(playboyS2);
//        long endTime = System.currentTimeMillis();
//        System.out.println("Creation of the content took " + (endTime -
//                startTime) + " milliseconds");
//        startTime = System.currentTimeMillis();
//        playboyS1.print();
//        endTime = System.currentTimeMillis();
//        System.out.println("Printing of the section 1 took " + (endTime -
//                startTime) + " milliseconds");
//        startTime = System.currentTimeMillis();
//        playboyS1.print();
//        endTime = System.currentTimeMillis();
//        System.out.println("Printing again the section 1 took " + (endTime -
//                startTime) + " milliseconds");
// ------------------------------------------------------
//        Section cap1 = new Section("Capitolul 1");
//
//        Paragraph p1 = new Paragraph("Paragraph 1");
//        cap1.add(p1);
//
//        Paragraph p2 = new Paragraph("Paragraph 2");
//        cap1.add(p2);
//
//        Paragraph p3 = new Paragraph("Paragraph 3");
//        cap1.add(p3);
//
//        Paragraph p4 = new Paragraph("Paragraph 4");
//        cap1.add(p4);
//
//        System.out.println("Printing without Alignment");
//        System.out.println();
//        cap1.print();
//
//        p1.setAlignStrategy(new AlignCenter());
//        p2.setAlignStrategy(new AlignRight());
//        p3.setAlignStrategy(new AlignLeft());
//
//        System.out.println();
//        System.out.println("Printing with Alignment");
//        System.out.println();
//        cap1.print();
//        -----------------------------------------------------
        ApplicationContext context =
                SpringApplication.run(DesignPatternsLab2Application.class, args);
// Gets an instance of TransientComponent from the DI context
        TransientComponent transientBean =
                context.getBean(TransientComponent.class);
        transientBean.operation();
// Note that every time an instance is required,
// the DI context creates a new one
        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();
// Gets an instance of SingletonComponent from the DI context
// Note that the unique instance was created while
// application was loaded, before creating
// the transient instances
        SingletonComponent singletonBean =
                context.getBean(SingletonComponent.class);
        singletonBean.operation();
// Note that every time an instance is required,
// the DI returns the same unique one
        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();
// Gets an instance of another class that
// requires singleton/transient components
// Note where this instance was created and what beans
// were used to initialize it
        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();
// One can also request an instance from DI context by name
        c = (ClientComponent)context.getBean("clientComponent");
        c.operation();
        RenderContentVisitor renderVisitor = new RenderContentVisitor();

        // Use the visitor to render content
        c.accept(renderVisitor);
        // or
        new RenderContentVisitor().visitBook(c);

    }



}
