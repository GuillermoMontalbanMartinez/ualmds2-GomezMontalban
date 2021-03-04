import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select-text-field.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaDarAltaCuenta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;">
 <h4 style="align-self: center; margin-bottom: var(--lumo-space-xl);">Dar de alta cuenta de usuario</h4>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
  <vaadin-horizontal-layout style="align-self: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin-right: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m);">
    <label style="flex-shrink: 0; align-self: center;">Nombre de usuario</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-m);">
    <vaadin-text-field style="flex-shrink: 0; align-self: center;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; align-self: center; flex-shrink: 0;">
  <vaadin-horizontal-layout style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout style="align-self: center; justify-content: center; margin-bottom: var(--lumo-space-m); flex-shrink: 0; margin-right: var(--lumo-space-xl);">
    <label style="align-self: center; flex-shrink: 0; margin-right: var(--lumo-space-xl);">Correo</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-xl);">
    <vaadin-text-field style="align-self: center; flex-shrink: 0;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; flex-shrink: 0; align-self: center; margin-bottom: var(--lumo-space-m); margin-right: var(--lumo-space-xl);">
    <label style="margin-right: var(--lumo-space-xl);">Contraseña</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-xs);">
    <vaadin-select-text-field style="align-self: center; flex-shrink: 0;"></vaadin-select-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center;">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-items: center; justify-content: center; align-self: center; margin-bottom: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; align-self: center; flex-shrink: 0; margin-bottom: var(--lumo-space-m); margin-right: var(--lumo-space-xl);">
    <label style="flex-shrink: 0; align-self: center;">Tipo de usuario</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-items: center; justify-content: center; align-self: center; margin-bottom: var(--lumo-space-m);">
    <vaadin-combo-box></vaadin-combo-box>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout style="margin-bottom: var(--lumo-space-m);">
    <vaadin-button theme="primary">
     Cancelar
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="margin-bottom: var(--lumo-space-m);">
    <vaadin-button theme="primary">
     Aceptar
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-dar-alta-cuenta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarAltaCuenta.is, VistaDarAltaCuenta);
