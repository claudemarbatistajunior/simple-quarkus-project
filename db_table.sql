-- Table: public.book

-- DROP TABLE public.book;

CREATE TABLE public.book
(
    id uuid NOT NULL,
    editor character varying(255) COLLATE pg_catalog."default",
    gender character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    price numeric(19,2),
    register timestamp without time zone,
    version integer,
    year integer,
    CONSTRAINT book_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE public.book
    OWNER to postgres;