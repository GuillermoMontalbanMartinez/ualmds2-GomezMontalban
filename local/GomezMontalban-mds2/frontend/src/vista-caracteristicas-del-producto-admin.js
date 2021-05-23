import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-resenas-producto.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaCaracteristicasDelProductoAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <p>Nombre:</p>
  <vaadin-text-field id="nombreText" style="align-self: center;" readonly></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="height: 60%; width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
    <img id="foto" style="width: 100%; height: 100%;">
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%;">
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
      <img id="foto1" style="width: 100%; height: 100%;">
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
      <img id="foto2" style="width: 100%; height: 100%;">
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
      <img id="foto3" style="width: 100%; height: 100%;">
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
      <img id="foto4" style="width: 100%; height: 100%;">
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 90%; height: 70%; margin-left: var(--lumo-space-xl);">
   <vaadin-vertical-layout theme="spacing" style="width: 90%; height: 70%; margin-left: var(--lumo-space-xl);">
    <p>Descripción</p>
    <vaadin-text-area id="descripcionText" style="width: 100%; height: 100%;" readonly></vaadin-text-area>
    <vaadin-horizontal-layout theme="spacing">
     <p>Precio:</p>
     <vaadin-text-field id="precioText" style="align-self: center; padding-right: var(--lumo-space-xl); margin-right: var(--lumo-space-xl);" readonly></vaadin-text-field>
     <p style="margin-left: var(--lumo-space-xl);">Valoración media : </p>
     <vaadin-text-field id="valoracionText" style="align-self: center;" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
    <vaadin-vertical-layout theme="spacing" id="layoutResenas" style="width: 100%; height: 100%;">
     <vista-resenas-producto></vista-resenas-producto>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-caracteristicas-del-producto-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCaracteristicasDelProductoAdmin.is, VistaCaracteristicasDelProductoAdmin);
