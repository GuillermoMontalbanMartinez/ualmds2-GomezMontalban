import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<<<<<<< HEAD
<vaadin-vertical-layout style="width: 100%; border: #ccc solid 2px; border-radius : 20px; background: radial-gradient(circle, rgba(174,238,236,1) 63%, rgba(239,248,249,1) 100%);">
 <vaadin-vertical-layout style="align-self: center; width: 100%;">
  <vaadin-horizontal-layout style="align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout style="margin: var(--lumo-space-m);">
    <h4 style="align-self: center;">Producto</h4>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout>
    <vaadin-text-field style="margin: var(--lumo-space-m);" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
=======
<vaadin-vertical-layout style="width: 100%; border: #ccc solid 2px; border-radius : 20px; background: radial-gradient(circle, rgba(174,238,236,1) 63%, rgba(239,248,249,1) 100%); height: 100%;">
 <vaadin-horizontal-layout style="width: 100%;">
  <vaadin-horizontal-layout>
   <label>Nombre del producto </label>
>>>>>>> branch 'master' of https://github.com/GuillermoMontalbanMartinez/ualmds2-GomezMontalban.git
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout style="width: 100%;">
   <vaadin-horizontal-layout style="width: 100%;">
    <vaadin-horizontal-layout style="width: 30%; margin: var(--lumo-space-m);">
     <img style="width: 100%; height: 100%;">
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="width: 70%; margin: var(--lumo-space-xs);">
     <vaadin-text-area style="width: 100%; height: 100%; flex-shrink: 1;" readonly></vaadin-text-area>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
<<<<<<< HEAD
 <vaadin-vertical-layout style="width: 100%; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout style="width: 100%; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout style="align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout>
     <label>Precio </label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout>
     <vaadin-text-field readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
    <vaadin-button theme="icon" aria-label="Add new">
     <iron-icon icon="lumo:plus"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
=======
 <vaadin-vertical-layout>
  <h2 style="margin: var(--lumo-space-xl);">Reseñas</h2>
  <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
>>>>>>> branch 'master' of https://github.com/GuillermoMontalbanMartinez/ualmds2-GomezMontalban.git
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto.is, VistaProducto);
