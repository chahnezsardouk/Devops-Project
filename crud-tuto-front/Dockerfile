#FROM nginx:alpine
#COPY dist/crudtuto-Front /usr/share/nginx/html
#EXPOSE 4200:80



FROM node:14 as builder
#WORKDIR /app
#COPY package*.json ./
#RUN npm install
#COPY . .
#RUN ng build --prod

FROM nginx:alpine
COPY --from=builder /app/dist/crudtuto-Front /usr/share/nginx/html
EXPOSE 80

# Start the Nginx web server
CMD ["nginx", "-g", "daemon off;"]
