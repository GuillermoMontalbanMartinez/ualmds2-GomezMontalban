import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-reseņas`
 *
 * VistaReseņas element.
 *
 * @customElement
 * @polymer
 */
class VistaReseņas extends PolymerElement {

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
        return 'vista-reseņas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaReseņas.is, VistaReseņas);
