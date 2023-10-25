#FROM nginx:alpine
#COPY dist/crudtuto-Front /usr/share/nginx/html
#EXPOSE 4200:80



#FROM node:latest as build
#WORKDIR /usr/local/app
#COPY ./ /usr/local/app/
#RUN npm install
#RUN npm run build

FROM nginx:alpine
COPY --from=build /usr/local/app/dist/crudtuto-Front /usr/share/nginx/html
EXPOSE 4200:80
