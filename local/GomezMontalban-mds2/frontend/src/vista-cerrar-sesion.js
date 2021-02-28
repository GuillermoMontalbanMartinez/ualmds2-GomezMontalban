import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-cerrar-sesion`
 *
 * VistaCerrarSesion element.
 *
 * @customElement
 * @polymer
 */
class VistaCerrarSesion extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-cerrar-sesion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCerrarSesion.is, VistaCerrarSesion);
