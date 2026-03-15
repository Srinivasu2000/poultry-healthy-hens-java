FROM nginx:latest

COPY target/healthy-hens-1.0.war /usr/share/nginx/html

EXPOSE 80

CMD ["nginix", "-g", "daemon off":]
